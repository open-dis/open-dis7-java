package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4647881c;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13694
 */
public class YPTWeaponRecovery extends EntityType
{
    /** Default constructor */
    public YPTWeaponRecovery()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 13670, Light/Patrol craft
        setSubCategory((byte)17); // uid 13693, Shelon class (torpedo operating/patrol & target craft)
        setSpecific((byte)1); // uid 13694, YPT Weapon Recovery
    }
}
