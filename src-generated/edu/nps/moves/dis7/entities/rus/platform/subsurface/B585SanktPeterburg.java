package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27b45ea;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26549
 */
public class B585SanktPeterburg extends EntityType
{
    /** Default constructor */
    public B585SanktPeterburg()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 14799, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)7); // uid 26548, Lada class (Project 677)
        setSpecific((byte)1); // uid 26549, B-585 Sankt Peterburg
    }
}
