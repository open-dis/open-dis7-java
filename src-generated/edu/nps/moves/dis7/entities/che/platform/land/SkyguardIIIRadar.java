package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3968bc60;
 * Country: Switzerland (CHE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28903
 */
public class SkyguardIIIRadar extends EntityType
{
    /** Default constructor */
    public SkyguardIIIRadar()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 19039, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 19040, Oerlikon GDF Skyguard Skyshield System
        setSpecific((byte)4); // uid 28902, Skyguard Radar
        setExtra((byte)1); // uid 28903, Skyguard III Radar
    }
}
