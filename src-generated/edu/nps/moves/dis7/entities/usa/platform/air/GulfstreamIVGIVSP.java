package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@59fc6d05
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 27633
 */
public class GulfstreamIVGIVSP extends EntityType
{
    public GulfstreamIVGIVSP()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23799, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23800, Twin Jet
        setSpecific((byte)7); // uid 27632, Gulfstream Aerospace Gulfstream IV
        setExtra((byte)1); // uid 27633, Gulfstream IV GIV SP
    }
}
