package edu.nps.moves.dis7.entities.rus.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c8f4bc7;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 20551
 */
public class Jettisonedvehicle extends EntityType
{
    /** Default constructor */
    public Jettisonedvehicle()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 20530, Guided
        setSubCategory((byte)12); // uid 20549, SS-N-19 Shipwreck
        setSpecific((byte)2); // uid 20551, Jettisoned vehicle
    }
}
