package edu.nps.moves.dis7.entities.ser.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@36c0d0bd;
 * Country: Serbia and Montenegro;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23671
 */
public class SelfPropelledVSHORADGunMissileSystem extends EntityType
{
    /** Default constructor */
    public SelfPropelledVSHORADGunMissileSystem()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 23670, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 23671, Self -Propelled VSHORAD Gun / Missile System
    }
}
