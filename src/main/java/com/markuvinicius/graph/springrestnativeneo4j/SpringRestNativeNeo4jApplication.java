package com.markuvinicius.graph.springrestnativeneo4j;

import com.markuvinicius.graph.springrestnativeneo4j.domain.Partnership;
import com.markuvinicius.graph.springrestnativeneo4j.domain.PartnershipRelation;
import com.markuvinicius.graph.springrestnativeneo4j.domain.Person;
import com.markuvinicius.graph.springrestnativeneo4j.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@SpringBootApplication
public class SpringRestNativeNeo4jApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestNativeNeo4jApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person person = new Person();
		person.setPersonId(UUID.randomUUID().toString());
		person.setFirstName("Marku Vinicius");
		person.setLastName("da Silva");

		Person person2 = new Person();
		person2.setPersonId(UUID.randomUUID().toString());
		person2.setFirstName("Marcella");
		person2.setLastName("Priscilla");

		Partnership partnership = new Partnership();
		partnership.setShareHolding(1.4F);
		partnership.setPartner(person2);

		PartnershipRelation partnershipRelation = new PartnershipRelation();
		partnershipRelation.setSource(person);
		partnershipRelation.setPartnership(partnership);

		person.setPartnershipRelationSet(Set.of(partnershipRelation));

		personRepository.save(person);
	}
}
