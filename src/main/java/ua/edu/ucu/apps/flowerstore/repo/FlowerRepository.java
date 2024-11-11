package ua.edu.ucu.apps.flowerstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.edu.ucu.apps.flowerstore.flowers.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
