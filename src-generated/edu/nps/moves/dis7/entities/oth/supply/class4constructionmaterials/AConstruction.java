package edu.nps.moves.dis7.entities.oth.supply.class4constructionmaterials;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6996bbc4
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_4_CONSTRUCTION_MATERIALS
 *
 * Entity type uid: 30690
 */
public class AConstruction extends EntityType
{
    public AConstruction()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_4_CONSTRUCTION_MATERIALS));

        setCategory((byte)2); // uid 30690, A - Construction
    }
}
