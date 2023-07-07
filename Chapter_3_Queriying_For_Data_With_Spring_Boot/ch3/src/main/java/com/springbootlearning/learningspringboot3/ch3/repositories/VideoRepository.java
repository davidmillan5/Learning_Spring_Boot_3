package com.springbootlearning.learningspringboot3.ch3.repositories;

import com.springbootlearning.learningspringboot3.ch3.entities.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
}
