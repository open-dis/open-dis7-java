package edu.nps.moves.dis7.entities.tur.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@54e2fe;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25564
 */
public class ACV300 extends EntityType
{
    /** Default constructor */
    public ACV300()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 25563, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 25564, ACV 300
    }
}
