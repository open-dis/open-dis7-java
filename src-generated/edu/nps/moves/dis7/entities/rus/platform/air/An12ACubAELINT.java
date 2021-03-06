package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17d2ed1b;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13366
 */
public class An12ACubAELINT extends EntityType
{
    /** Default constructor */
    public An12ACubAELINT()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 13350, Cargo/Tanker
        setSubCategory((byte)5); // uid 13364, An-12 Cub
        setSpecific((byte)2); // uid 13366, An-12A Cub A, ELINT
    }
}
