package edu.nps.moves.dis7.entities.arg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3581c5f3;
 * Country: Argentina (ARG);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31268
 */
public class P46GomezRoca extends EntityType
{
    /** Default constructor */
    public P46GomezRoca()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 31257, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 31262, Espora Class (Meko 140)
        setSpecific((byte)6); // uid 31268, P 46 Gomez Roca
    }
}
