package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@544a2ea6;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31974
 */
public class CSS5Mod4DF21CWheeledTransporterErectorLauncherTEL extends EntityType
{
    /** Default constructor */
    public CSS5Mod4DF21CWheeledTransporterErectorLauncherTEL()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)33); // uid 31971, CSS-5 Mod 1 (DF-21) Wheeled Transporter Erector Launcher (TEL)
        setSpecific((byte)3); // uid 31974, CSS-5 Mod 4 (DF-21C) Wheeled Transporter Erector Launcher (TEL)
    }
}
