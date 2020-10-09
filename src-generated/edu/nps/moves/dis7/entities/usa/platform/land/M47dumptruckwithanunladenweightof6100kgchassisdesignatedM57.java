package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b95a6db
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10421
 */
public class M47dumptruckwithanunladenweightof6100kgchassisdesignatedM57 extends EntityType
{
    public M47dumptruckwithanunladenweightof6100kgchassisdesignatedM57()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 10419, M35/M44A2 6x6 2-1/2 ton cargo truck series
        setSpecific((byte)2); // uid 10421, M47: dump truck with an unladen weight of 6100 kg, chassis designated M57
    }
}
