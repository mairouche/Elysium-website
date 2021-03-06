package fr.elysium.guilde.website.business.service.media.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.elysium.guilde.website.business.service.media.ArticleService;
import fr.elysium.guilde.website.persistence.entity.media.Article;
import fr.elysium.guilde.website.persistence.repository.media.ArticleRepository;

/**
 * <b>ArticleServiceImpl</b> implementation of ArticleService
 * 
 * @author Meidi
 *
 */
@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  private ArticleRepository articleRepository;

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Article> listLastNews(int nbNews) {
    Pageable nbNewsLimit = new PageRequest(0, nbNews);
    return this.articleRepository.findAll(nbNewsLimit).getContent();
  }

}
