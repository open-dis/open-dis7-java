package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@267cde2e;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10420
 */
public class M34cargotruckwithanunladenweightof5332kgchassisdesignatedM44 extends EntityType
{
    /** Default constructor */
    public M34cargotruckwithanunladenweightof5332kgchassisdesignatedM44()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 10419, M35/M44A2 6x6 2-1/2 ton cargo truck series
        setSpecific((byte)1); // uid 10420, M34: cargo truck with an unladen weight of 5332 kg, chassis designated M44
    }
}
