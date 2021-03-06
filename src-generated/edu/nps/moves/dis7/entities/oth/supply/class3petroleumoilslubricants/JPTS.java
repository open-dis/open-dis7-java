package edu.nps.moves.dis7.entities.oth.supply.class3petroleumoilslubricants;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79ba0285;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_3_PETROLEUM_OILS_LUBRICANTS;
 *
 * Entity type uid: 30678
 */
public class JPTS extends EntityType
{
    /** Default constructor */
    public JPTS()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_3_PETROLEUM_OILS_LUBRICANTS));

        setCategory((byte)2); // uid 30674, A - POL for Air Vehicles
        setSubCategory((byte)4); // uid 30678, JPTS
    }
}
