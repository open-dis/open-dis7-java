package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ffcb232;
 * Country: United States of America (USA);
 * Entity kind: Radio;
 * Domain: LAND;
 *
 * Entity type uid: 22208
 */
public class ILSLocalizerTransmitterOther extends EntityType
{
    /** Default constructor */
    public ILSLocalizerTransmitterOther()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 22207, Instrumented Landing System (ILS) Localizer Transmitter
        setSubCategory((byte)0); // uid 22208, ILS Localizer Transmitter, Other
    }
}
