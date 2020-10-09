package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@37f1104d
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 22976
 */
public class VBRLightArmoredCar extends EntityType
{
    public VBRLightArmoredCar()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 15645, Armored Fighting Vehicle
        setSubCategory((byte)15); // uid 22976, VBR Light Armored Car
    }
}
