package edu.nps.moves.dis7.entities.sgp.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@71b6d77f;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28711
 */
public class M113A2UltraMechanisedIgla extends EntityType
{
    /** Default constructor */
    public M113A2UltraMechanisedIgla()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 28710, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 28711, M113A2 Ultra Mechanised Igla
    }
}
