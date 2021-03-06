package edu.nps.moves.dis7.entities.swe.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c5747db;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 21633
 */
public class RBS70Mk2 extends EntityType
{
    /** Default constructor */
    public RBS70Mk2()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21630, Guided
        setSubCategory((byte)1); // uid 21631, RBS-70
        setSpecific((byte)2); // uid 21633, RBS-70 Mk 2
    }
}
