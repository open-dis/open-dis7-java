package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2df65a56
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 29684
 */
public class Donzi35ZRCuddy extends EntityType
{
    public Donzi35ZRCuddy()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)87); // uid 28469, Other Vessels
        setSubCategory((byte)1); // uid 28470, Go-Fast Boat
        setSpecific((byte)2); // uid 29682, Donzi ZR
        setExtra((byte)2); // uid 29684, Donzi 35 ZR Cuddy
    }
}
