package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@736e9adb;
 * Country: Algeria (DZA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27055
 */
public class _472KalaatBeniHammad extends EntityType
{
    /** Default constructor */
    public _472KalaatBeniHammad()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 27053, Tank Landing Ship
        setSubCategory((byte)1); // uid 27054, Kalaat Beni Hammed Class
        setSpecific((byte)1); // uid 27055, 472 Kalaat Beni Hammad
    }
}
