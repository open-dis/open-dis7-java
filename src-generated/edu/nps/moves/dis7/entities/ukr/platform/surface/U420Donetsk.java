package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ae2db25;
 * Country: Ukraine (UKR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28802
 */
public class U420Donetsk extends EntityType
{
    /** Default constructor */
    public U420Donetsk()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 28800, Air Cushion/Surface Effect
        setSubCategory((byte)1); // uid 28801, Zubr Class
        setSpecific((byte)1); // uid 28802, U-420 Donetsk
    }
}
