package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6df97b55;
 * Country: Bangladesh (BGD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32612
 */
public class P8128Durdondo extends EntityType
{
    /** Default constructor */
    public P8128Durdondo()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 32608, Fast Attack Craft
        setSubCategory((byte)1); // uid 32609, Durdharsha Class (Type 021)
        setSpecific((byte)3); // uid 32612, P8128 Durdondo
    }
}
