package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@49cf9028;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29993
 */
public class _564MagometGadzhiev extends EntityType
{
    /** Default constructor */
    public _564MagometGadzhiev()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 13709, Mine Countermeasure Ship / Craft
        setSubCategory((byte)6); // uid 13738, Sonya class
        setSpecific((byte)19); // uid 29993, 564 Magomet Gadzhiev
    }
}
