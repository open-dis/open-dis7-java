package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5e8f9e2d
 * Country: Korea (Democratic Peoples Republic of) (PRK)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 17759
 */
public class TaepoDongILauncher extends EntityType
{
    public TaepoDongILauncher()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 17750, Self-Propelled Artillery
        setSubCategory((byte)5); // uid 17759, Taepo Dong I Launcher
    }
}
