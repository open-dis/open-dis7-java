package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a48a7f3;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 14524
 */
public class VladimirRusanovexLedokol71964 extends EntityType
{
    /** Default constructor */
    public VladimirRusanovexLedokol71964()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 14477, Auxiliary, Merchant Marine
        setSubCategory((byte)8); // uid 14511, Dobrynya Nikitich class (ice breakers)
        setSpecific((byte)13); // uid 14524, Vladimir Rusanov (ex-Ledokol 7) (1964)
    }
}
