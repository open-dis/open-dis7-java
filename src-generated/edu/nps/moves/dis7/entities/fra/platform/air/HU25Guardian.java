package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34f5090e;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15799
 */
public class HU25Guardian extends EntityType
{
    /** Default constructor */
    public HU25Guardian()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 15791, Cargo/Tanker
        setSubCategory((byte)6); // uid 15798, Dassault Mystere-Falcon 20
        setSpecific((byte)1); // uid 15799, HU-25 Guardian
    }
}
