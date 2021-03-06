package edu.nps.moves.dis7.entities.aut.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@35f983a6;
 * Country: Austria (AUT);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24133
 */
public class Steyr14916x6 extends EntityType
{
    /** Default constructor */
    public Steyr14916x6()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 24132, Large Wheeled Utility Vehicle - (greater than 1.25 tons)
        setSubCategory((byte)1); // uid 24133, Steyr 1491 (6x6)
    }
}
