package br.com.evaluation.twitterreportapi.infra.repositories;

import br.com.evaluation.twitterreportapi.domain.entities.TweetEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetEntityRepository extends MongoRepository<TweetEntity, Long>, TweetEntityRepositoryCustomized {

}
