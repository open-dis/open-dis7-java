package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64485a47;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31970
 */
public class CSS4ADF5AWheeledTransporterErectorLauncherTEL extends EntityType
{
    /** Default constructor */
    public CSS4ADF5AWheeledTransporterErectorLauncherTEL()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)32); // uid 31969, CSS-4 (DF-5) Wheeled Transporter Erector Launcher (TEL)
        setSpecific((byte)1); // uid 31970, CSS-4A (DF-5A) Wheeled Transporter Erector Launcher (TEL)
    }
}
