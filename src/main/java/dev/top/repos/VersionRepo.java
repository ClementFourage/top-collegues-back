package dev.top.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.top.entities.Version;

public interface VersionRepo extends JpaRepository<Version, Integer> {
}
