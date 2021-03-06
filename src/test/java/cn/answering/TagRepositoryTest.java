package cn.answering;

import cn.answering.domain.Article;
import cn.answering.domain.es.ElastArticle;
import cn.answering.repository.TagRepository;
import cn.answering.repository.es.ElastArticleRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@DataMongoTest
@RunWith(SpringRunner.class)
@SpringBootTest
public class TagRepositoryTest {

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private ElastArticleRepository elastArticleRepository;

    /*@Test
    public void saveTag(){
        for (int i = 0; i < 10; i++){
            Tag tag = new Tag("tagName"+i);
            tagRepository.save(tag);
        }
    }
*/
    @Before
    public void  init(){

    }

    @Test
    public void find(){
        Page<ElastArticle> articles = (Page<ElastArticle>) elastArticleRepository.findAll();

        List<ElastArticle> a = articles.getContent();
        System.out.println(a.size());
    }
}
