package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7bbc8656;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22743
 */
public class GTKBoxerarmouredfightingvehicle extends EntityType
{
    /** Default constructor */
    public GTKBoxerarmouredfightingvehicle()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 16263, Armored Utility Vehicle
        setSubCategory((byte)10); // uid 22743, GTK Boxer armoured fighting vehicle
    }
}
