package com.markuvinicius.graph.springrestnativeneo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

import javax.servlet.http.Part;
import java.util.Set;

@NodeEntity(label = "PERSON")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id @GeneratedValue
    private Long id;

    @Index
    private String personId;

    private String firstName;

    private String lastName;

    @Relationship(type = "PARTNER")
    private Set<PartnershipRelation> partnershipRelationSet;
}
