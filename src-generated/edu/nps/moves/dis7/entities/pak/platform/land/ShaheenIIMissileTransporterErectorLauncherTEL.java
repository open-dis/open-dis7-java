package edu.nps.moves.dis7.entities.pak.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@304a9d7b;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27163
 */
public class ShaheenIIMissileTransporterErectorLauncherTEL extends EntityType
{
    /** Default constructor */
    public ShaheenIIMissileTransporterErectorLauncherTEL()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 27162, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 27163, Shaheen-II Missile Transporter Erector Launcher (TEL)
    }
}
