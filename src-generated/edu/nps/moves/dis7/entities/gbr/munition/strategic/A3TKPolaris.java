package edu.nps.moves.dis7.entities.gbr.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@52d96367;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 21026
 */
public class A3TKPolaris extends EntityType
{
    /** Default constructor */
    public A3TKPolaris()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21025, Guided
        setSubCategory((byte)1); // uid 21026, A-3TK Polaris
    }
}
