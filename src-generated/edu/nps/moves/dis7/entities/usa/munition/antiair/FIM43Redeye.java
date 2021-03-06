package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@710ae6a7;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 19439
 */
public class FIM43Redeye extends EntityType
{
    /** Default constructor */
    public FIM43Redeye()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)10); // uid 19439, FIM-43 Redeye
    }
}
