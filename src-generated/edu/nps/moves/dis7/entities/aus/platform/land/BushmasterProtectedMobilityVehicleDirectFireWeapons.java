package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5eb5c224;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28608
 */
public class BushmasterProtectedMobilityVehicleDirectFireWeapons extends EntityType
{
    /** Default constructor */
    public BushmasterProtectedMobilityVehicleDirectFireWeapons()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)2); // uid 26912, Bushmaster Protected Mobility Vehicle
        setSpecific((byte)3); // uid 28608, Bushmaster Protected Mobility Vehicle - Direct Fire Weapons
    }
}
