package edu.nps.moves.dis7.entities.sgp.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29f85fe1;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25552
 */
public class Bionix25 extends EntityType
{
    /** Default constructor */
    public Bionix25()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 25549, Armored Fighting Vehicle
        setSubCategory((byte)2); // uid 25551, Bionix AFV
        setSpecific((byte)1); // uid 25552, Bionix 25
    }
}
