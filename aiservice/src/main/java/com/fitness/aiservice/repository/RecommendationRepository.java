package com.fitness.aiservice.repository;

import com.fitness.aiservice.model.Recommendation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecommendationRepository extends MongoRepository<Recommendation, String> {

    // Correct: Finds all documents where the 'userId' field matches.
    List<Recommendation> findByUserId(String userId);

    // Correct: Finds one document where the 'activityId' field matches.
    Optional<Recommendation> findByActivityId(String activityId);

}