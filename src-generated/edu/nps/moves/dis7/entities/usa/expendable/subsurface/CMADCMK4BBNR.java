package edu.nps.moves.dis7.entities.usa.expendable.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32d22650;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22278
 */
public class CMADCMK4BBNR extends EntityType
{
    /** Default constructor */
    public CMADCMK4BBNR()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 22272, Active Emitter
        setSubCategory((byte)5); // uid 22277, CM ADC MK 4
        setSpecific((byte)1); // uid 22278, CM ADC MK 4 BBNR
    }
}
