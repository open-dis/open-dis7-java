package edu.nps.moves.dis7.entities.gbr.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@66234b0f;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 21011
 */
public class _762mm extends EntityType
{
    /** Default constructor */
    public _762mm()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 21010, Ballistic
        setSubCategory((byte)1); // uid 21011, 7.62 mm
    }
}
