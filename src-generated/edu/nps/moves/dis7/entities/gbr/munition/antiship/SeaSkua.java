package edu.nps.moves.dis7.entities.gbr.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3957d88b;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21001
 */
public class SeaSkua extends EntityType
{
    /** Default constructor */
    public SeaSkua()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 20997, Guided
        setSubCategory((byte)4); // uid 21001, Sea Skua
    }
}
