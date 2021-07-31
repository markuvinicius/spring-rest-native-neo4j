package com.markuvinicius.graph.springrestnativeneo4j.domain;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type="PARTNER")
@Getter @Setter
public class PartnershipRelation {
    @Id @GeneratedValue
    private Long id;

    @StartNode
    Person source;

    @EndNode
    Partnership partnership;
}
