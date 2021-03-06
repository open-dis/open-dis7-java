package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32b260fa;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15841
 */
public class GazelleHTMk3 extends EntityType
{
    /** Default constructor */
    public GazelleHTMk3()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)6); // uid 15838, Aerospatiale SA 341 Gazelle
        setSpecific((byte)3); // uid 15841, Gazelle HT. Mk 3
    }
}
