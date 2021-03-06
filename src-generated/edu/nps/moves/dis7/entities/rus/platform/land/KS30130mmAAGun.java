package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f952d6c;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 13128
 */
public class KS30130mmAAGun extends EntityType
{
    /** Default constructor */
    public KS30130mmAAGun()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)13); // uid 13127, Towed VSHORAD Gun/Missile System
        setSpecific((byte)1); // uid 13128, KS-30 130mm AA Gun
    }
}
