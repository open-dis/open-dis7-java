package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3d0f8e03
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 31949
 */
public class Type81253mmMinesweepingMultipleRocketLauncherMRL extends EntityType
{
    public Type81253mmMinesweepingMultipleRocketLauncherMRL()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)49); // uid 31949, Type 81 253mm Minesweeping Multiple Rocket Launcher (MRL)
    }
}
