package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@201a4587;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23847
 */
public class AirbusA3101 extends EntityType
{
    /** Default constructor */
    public AirbusA3101()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)88); // uid 23844, Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23845, Twin Jet
        setSpecific((byte)2); // uid 23847, Airbus A310
    }
}
