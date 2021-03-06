package edu.nps.moves.dis7.entities.usa.expendable.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1fbd5e0;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22276
 */
public class CMADCMK2N extends EntityType
{
    /** Default constructor */
    public CMADCMK2N()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 22272, Active Emitter
        setSubCategory((byte)4); // uid 22276, CM ADC MK 2 N
    }
}
