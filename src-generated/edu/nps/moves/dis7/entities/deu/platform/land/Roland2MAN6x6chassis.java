package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@50029372;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25025
 */
public class Roland2MAN6x6chassis extends EntityType
{
    /** Default constructor */
    public Roland2MAN6x6chassis()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 16322, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)1); // uid 16323, Roland SAM System
        setExtra((byte)3); // uid 25025, Roland 2, MAN 6x6 chassis
    }
}
