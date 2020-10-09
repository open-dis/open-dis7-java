package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16022d9d
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 31966
 */
public class CSS10ADFA31WheeledTransporterErectorLauncherTEL extends EntityType
{
    public CSS10ADFA31WheeledTransporterErectorLauncherTEL()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)29); // uid 31965, CSS-10 (DF-31) Wheeled Transporter Erector Launcher (TEL)
        setSpecific((byte)1); // uid 31966, CSS-10A (DFA-31) Wheeled Transporter Erector Launcher (TEL)
    }
}
